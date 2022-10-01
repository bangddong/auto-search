function showCssSearchModal() {
    let searchUrl = document.getElementById("inputUrl");

    if (searchUrl.value.trim() === "") {
        alert("URL을 먼저 입력해주세요.");
        searchUrl.focus();
        return;
    }

    const testModal = document.getElementById("testModal");
    testModal.style.display = "block";
    testModal.style.paddingRight = "17px";
    testModal.className="modal fade show";
}