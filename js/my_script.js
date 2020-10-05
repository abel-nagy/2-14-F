
function readFileIntoTag(URL, id) {

    const xhr = new XMLHttpRequest();
    xhr.open("GET", URL, true);
    xhr.onreadystatechange = function () {
        if(xhr.readyState === XMLHttpRequest.DONE) {
            var status = xhr.status;
            if(status === 0 || (status >= 200 && status < 400) ) {
                // The request has been completed successfully
                document.getElementById(id).value = xhr.responseText;
            } else {
                // Whoops
                console.log("YIKES");
            }
        }
    }
    xhr.send();
}