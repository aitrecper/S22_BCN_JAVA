$().ready(() => {
    $('img').hover(
        function () {
            $(this).attr("src", "./img/card-front.png");
        },
        function () {
            $(this).attr("src", "./img/card-back.png");
        }
    );
});