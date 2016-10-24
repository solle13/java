$(function(){
                $('#mod').click(function(){
                    $(this).next('#mod-content').slideToggle();
                    $(this).ToggleClass('active');
                });
            });
        