document.addEventListener("DOMContentLoaded", () => {
  const update_btns = document.querySelectorAll(".member.update_btn");
  const modal_box = document.querySelector("div.member.modal_back");
  const save_box = document.querySelector("button.member.modal_save_btn");
  const cancle_box = document.querySelector("button.member.modal_cancle_btn");

  //   console.log(cancle_box);
  //   console.log(save_box);
  const modal_open = function () {
    console.log("modal open");
    modal_box.style.display = "block";
  };

  const modal_close = function () {
    // console.log(cancle_box);
    // console.log(save_box);
    console.log("modal close");
    modal_box.style.display = "none";
  };
  for (let i = 0; i < update_btns.length; i++) {
    update_btns[i]?.addEventListener("click", modal_open);
  }
  save_box?.addEventListener("click", modal_close);
  cancle_box?.addEventListener("click", modal_close);
});
