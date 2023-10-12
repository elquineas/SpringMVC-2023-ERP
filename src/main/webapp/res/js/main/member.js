document.addEventListener("DOMContentLoaded", () => {
  const update_btns = document.querySelectorAll(".member.update_btn");
  const insert_btn = document.querySelector("button.member.insert_btn");
  const modal_box = document.querySelector("div.member.modal_back");
  const modal_box_save = document.querySelector("div.member.modal.save");
  const modal_box_insert = document.querySelector("div.member.modal.insert");
  const save_btn = document.querySelector("button.member.modal_save_btn");
  const cancle_btn = document.querySelector("button.member.modal_cancle_btn");
  const insert_save_btn = document.querySelector(
    "button.member.insert_save_btn"
  );
  const insert_cancle_btn = document.querySelector(
    "button.member.insert_cancle_btn"
  );

  const form_input = document.querySelector("form.member.save");
  const input_seq = document.querySelector("input#input_seq");
  const input_id = document.querySelector("input#input_id");
  const input_uname = document.querySelector("input#input_uname");
  const select_dname = document.querySelector("select#select_dname");
  const select_pname = document.querySelector("select#select_pname");

  const modal_close = function () {
    // console.log("modal close");
    input_seq.value = 0;
    input_id.value = "";
    input_uname.value = "";
    select_dname.value = "9999";
    select_pname.value = "9999";
    modal_box.style.display = "none";
  };

  for (let i = 0; i < update_btns.length; i++) {
    // update_btns[i]?.addEventListener("click", modal_open);
    update_btns[i]?.addEventListener("click", (e) => {
      modal_close();
      // console.log("modal open");
      modal_box_save.style.display = "block";
      modal_box_insert.style.display = "none";
      modal_box.style.display = "block";

      const seq = e.target.dataset.id;
      let u_seq = document.querySelector("input#u_seq_" + seq).value;
      let u_id = document.querySelector("td#id_" + seq).textContent;
      let u_name = document.querySelector("td#u_name_" + seq).textContent;
      let d_name = document.querySelector("input#d_name_" + seq).value;
      let p_name = document.querySelector("input#p_name_" + seq).value;
      // console.log(u_name, " : ", p_name);
      if (!d_name) {
        d_name = "9999";
      }
      if (!p_name) {
        p_name = "9999";
      }
      input_seq.value = u_seq;
      input_id.value = u_id;
      input_uname.value = u_name;
      select_dname.value = d_name;
      select_pname.value = p_name;
    });
    // update_btns[i]?.addEventListener("click", modal_open);
  }
  save_btn?.addEventListener("click", (e) => {
    // console.log("modal save");
    if (confirm("저장할까요?")) {
      form_input?.submit();
    }
  });
  const insert_form_input = document.querySelector("form.member.insert");
  const insert_input_seq = document.querySelector("input#insert_input_seq");
  const insert_input_id = document.querySelector("input#insert_input_id");
  const insert_input_uname = document.querySelector("input#insert_input_uname");
  const insert_select_dname = document.querySelector(
    "select#insert_select_dname"
  );
  const insert_select_pname = document.querySelector(
    "select#insert_select_pname"
  );

  insert_btn?.addEventListener("click", (e) => {
    modal_close();
    // console.log("modal open");
    modal_box_save.style.display = "none";
    modal_box_insert.style.display = "block";
    modal_box.style.display = "block";

    let new_seq = document.querySelector("input#new_seq").value;
    console.log("new_seq");
    insert_input_seq.value = new_seq;
    insert_input_id.value = "";
    insert_input_uname.value = "";
    insert_select_dname.value = "9999";
    insert_select_pname.value = "9999";
    insert_input_id.readOnly = false;
  });

  cancle_btn?.addEventListener("click", modal_close);
  insert_cancle_btn?.addEventListener("click", modal_close);

  insert_save_btn?.addEventListener("click", (e) => {
    // console.log("modal save");
    if (confirm("저장할까요?")) {
      insert_form_input?.submit();
    }
  });
});
