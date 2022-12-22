    
frase = input("Digite uma frase: ")
fraseLower = frase.lower()
  


if("de janeiro" in fraseLower):
  print(fraseLower.replace("de janeiro", "1"))
        
elif("de fevereiro" in fraseLower):
  print(fraseLower.replace("de fevereiro", "2"))
        
        
elif(("de marco" in fraseLower)):
  print(fraseLower.replace("de marco", "3"))
        
        
elif("de abril" in fraseLower):
   print(fraseLower.replace("de abril", "4"))
        
        
elif("de maio" in fraseLower):
  print(fraseLower.replace("de maio", "5"))
        
        
elif("de junho" in fraseLower):
  print(fraseLower.replace("de junho", "6"))
      
        
elif("de julho" in fraseLower):
  print(fraseLower.replace("de junho", "7"))
        
        
elif("de agosto" in fraseLower):
  print(fraseLower.replace("de agosto", "8"))
        
        
elif("de setembro" in fraseLower):
  print(fraseLower.replace("de setembro", "9"))
        
        
elif("de outubro" in fraseLower):
  print(fraseLower.replace("de outubro", "10"))
      
        
elif("de novembro" in fraseLower):
  print(fraseLower.replace("de novembro", "11"))
        
        
elif("de dezembro" in fraseLower):
  print(fraseLower.replace("de dezembro", "12"))

else: 
    print(frase)