var app = app || {}
app = (()=>{
      let _, js
      let init =x=>{
            _ = $.ctx()
            js = $.js()
      }
      let run =x=>{
            $.getScript(x+'/resources/js/router.js', ()=>{
                  $.extend(new Session(x))
            })
            onCreate()
      }
      let onCreate =()=>{
            setContentView()
      }
      let setContentView =()=>{
            $('<table id="tab"><tr></tr></table>')
            .css({
                  width : '80%',
                  height : '800px',
                  border : '1px solid black',
                  margin : '0 auto'
            })
            .appendTo('#wrapper')
            $('<td/>',{id : 'left'})
            .css({
                  width : '20%',
                  height : '100%',
                  border : '1px solid black',
                  'vertical-align' : 'top'
            })
            .appendTo('tr')
            $('<td/>',{id : 'right'})
            .css({
                  width : '80%',
                  height : '100%',
                  border : '1px solid black'
            })
            .appendTo('tr')
            $('<div/>')
            .css({
                  width : '100%',
                  height : '50px',
                  border : '1px solid black'
            })
            .appendTo('#left')
      }
      return{run}
})()