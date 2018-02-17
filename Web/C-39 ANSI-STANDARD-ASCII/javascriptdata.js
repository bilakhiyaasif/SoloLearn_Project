
        
        document.write("<table><tr><td>");
        document.write("<br/>"+"Alphabet[a-z]</br>");
        for(var i=97;i<=122;i++)
        {
             document.write(i+" "+String.fromCharCode(i)+"<br/>");
        } 
        document.write("</td></tr></table>");
        
        document.write("<table><tr><td>");
        document.write("<br/>"+"Special Char</br>");
        for(var i=32;i<=254;i++)
        {
        if(i>=32&&i<=47)
        {
             document.write(i+" "+String.fromCharCode(i)+"<br/>");
        }
        if(i>=58&&i<=64)
        {
            document.write(i+" "+String.fromCharCode(i)+"<br/>");
        }
        if(i>=91&&i<=96)
        {
           document.write(i+" "+String.fromCharCode(i)+"<br/>");
        }
        if(i>=123&&i<=126)
        {
            document.write(i+" "+String.fromCharCode(i)+"<br/>");
        }
        if(i>=224&&i<=254)
        {
             document.write(i+" "+String.fromCharCode(i)+"<br/>");
        }
       
        }
        document.write("</td></tr></table>");
        
        
        
        document.write("<table><tr><td>");
        document.write("<br/>"+"Number</br>");
        for(var i=48;i<=57;i++)
        {
       
        
             document.write(i+" "+String.fromCharCode(i)+"<br/>");
        }
        
        document.write("</td></tr></table>");


