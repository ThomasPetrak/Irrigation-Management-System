function fetchJSON(){ 
    $.ajax({ 
         type: "GET",
         dataType: "json",
         url: "https://api.github.com/users/hadley/orgs",
         success: function(data){      
            alert(data);
         }
     })
};
        
window.onload = fetchJSON;