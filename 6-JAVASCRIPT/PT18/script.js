$().ready(() => {
    $('img').hover(
        () => {
            $(this).attr("src", "./img/card-front.png");
        },
        () => {
            $(this).attr("src", "./img/card-back.png");
        }
    );
});