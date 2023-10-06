document.addEventListener("DOMContentLoaded", () => {
  //   const cancle_btn = document.querySelector("#cancle");
  const join_inputs = document.querySelectorAll(".join_form input");

  const test = function () {
    console.log(join_inputs);
  };
  document.querySelector("#cancle")?.addEventListener("click", test);
});
