file = open("bilakhiya_asif.txt", "w")
amount_written = file.write("Asif Bilakhiya\nthank you sololearn!")
print("Number of char: "+str(amount_written));
file.close()
print("File Reading...")
file = open("bilakhiya_asif.txt", "r")
print(file.read())
file.close() 
