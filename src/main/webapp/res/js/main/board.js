document.addEventListener("DOMContentLoaded", () => {
  const board_list = document.querySelector("tbody.board.list");

  const board_detail = (e) => {
    const board_target = e.target.parentElement;
    // console.log(board_target.tagName);
    if (board_target.tagName === "TR") {
      const seq = board_target.dataset.seq;
      // console.log(seq);
      document.location.href = `${rootPath}/main/bbs_detail?seq=${seq}`;
    }
    // if (btn_delete.tagName === "SPAN") {
    //   const seq = e.target.dataset.seq;
    //   if (confirm(`${seq} 사진을 삭제할까요?`)) {
    //     document.location.href = `${rootPath}/image_delete?seq=${seq}`;
    //   }
    // }
  };

  board_list?.addEventListener("click", board_detail);
});
