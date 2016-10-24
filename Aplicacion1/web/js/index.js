$( ".input" ).focusin(function() {
  $( this ).find( "span" ).animate({"opacity":"0"}, 200);
});

$( ".input" ).focusout(function() {
  $( this ).find( "span" ).animate({"opacity":"1"}, 300);
});

$(".login").submit(function(){
  //$(this).find(".submit i").removeAttr('class').addClass("fa fa-check").css({"color":"#fff"});
  $(".submit").css({"background":"#2ecc71", "border-color":"#2ecc71"});
  //$(".feedback").show().animate({"opacity":"1", "bottom":"-80px"}, 400);
  $("input").css({"border-color":"#2ecc71"});
  return true;
});
$(".login3").submit2(function(){
  //$(this).find(".submit2 i").removeAttr('class').addClass("fa fa-check").css({"color":"#fff"});
  $(".submit2").css({"background":"#2ecc71", "border-color":"#2ecc71"});
  //$(".feedback2").show().animate({"opacity":"1", "bottom":"-80px"}, 400);
  $(".input").css({"border-color":"#2ecc71"});
  return true;
});