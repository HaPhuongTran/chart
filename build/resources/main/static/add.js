
function add(){
	var title = document.getElementById("title").value;
	var author = document.getElementById("author").value;
	var req = new XMLHttpRequest();
	req.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	     document.getElementById("demo").innerHTML = this.responseText;
	    }
	};
	req.open("GET", "http://127.0.0.1:8000/book?title=" + title + "&author=" + author, false);
	req.send(null);
}

function getbook(){
	var id = document.getElementById("id").value;
	ar req = new XMLHttpRequest();
	req.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	     document.getElementById("demo").innerHTML = this.responseText;
	    }
	};
	req.open("", "http://127.0.0.1:8000/book/"+id, false);
	req.send(null);

}