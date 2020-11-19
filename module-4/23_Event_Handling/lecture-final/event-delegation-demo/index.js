const colors = document.getElementById("colors");
colors.addEventListener("click", event => {
  if (event.target.nodeName.toLowerCase() === "li") {
    event.target.style.backgroundColor = event.target.innerText;
  }
});

function addOrange() {
	const orange = document.createElement('li');
	orange.innerText = 'Orange';
	colors.appendChild(orange);
}

document.addEventListener('DOMContentLoaded', () => {
	const button = document.getElementById('btnAddOrange');
	button.addEventListener('click', addOrange);

	document.getElementById('btnAddAnyColor').addEventListener('click', () => {
		const li = document.createElement('li');
		li.innerText = document.getElementById('colorpicker').value;
		colors.appendChild(li);
	});

	colors.addEventListener('dblclick', event => {
		if (event.target.nodeName.toLowerCase() === "li") {
			event.target.style.backgroundColor = 'transparent';
		}
	});


});