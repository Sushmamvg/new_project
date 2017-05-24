<html>
<head>
<style>
  .thumb {
    height: 75px;
    border: 1px solid #000;
    margin: 10px 5px 0 0;
  }
  input#files {
    display: none;
}
label.button {
    background-color: green;
    color: #fff;
    padding: 9px;
    border-radius: 7px;
}
</style>
</head>
<body>
<div class="block"><br><br><br>
             <label class="button" for="files">Upload Images</label>
             <input type="file" id="files"  multiple />
             <div id="multiple-file-preview">
            <ul id="sortable">
              <div class="clear-both"></div>
            </ul>
             </div>
           </div>

<output id="list"></output>
<body>
<script>
  function handleFileSelect(evt) {
    var files = evt.target.files; // FileList object

    // Loop through the FileList and render image files as thumbnails.
    for (var i = 0, f; f = files[i]; i++) {

      // Only process image files.
      if (!f.type.match('image.*')) {
        continue;
      }

      var reader = new FileReader();

      // Closure to capture the file information.
      reader.onload = (function(theFile) {
        return function(e) {
          // Render thumbnail.
          var span = document.createElement('span');
          span.innerHTML = ['<img class="thumb" src="', e.target.result,
                            '" title="', escape(theFile.name), '"/>'].join('');
          document.getElementById('list').insertBefore(span, null);
        };
      })(f);

      // Read in the image file as a data URL.
      reader.readAsDataURL(f);
    }
  }

  document.getElementById('files').addEventListener('change', handleFileSelect, false);
</script>
</html>