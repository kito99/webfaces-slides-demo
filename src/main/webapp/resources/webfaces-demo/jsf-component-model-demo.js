class ComponentModelDemo {

	constructor(root, message) {
		this._root = root;
		this._message = message;
	}

	get message() {
		return this._message;
	}

	set message(message) {
		this._message = message;
		document.getElementById(this._root.id + ':message').innerText = message;
	}
}
