Assignment #1

The Repository 

This repository contains four Python assignments: an ASCII-to-decimal converter, a number-base converter supporting binary, decimal, octal, and hexadecimal, an image-to-text converter, and a text-to-image converter.


Code 1: ASCHII to Decimal

This program converts the word "hella" into decimal ASCII values. The string "hella" is saved in a variable s and passed to the ord() function, which loops through the characters in the string. The ord() function converts each character into an ASCII decimal value. In this example, for "hella".

h -> 104 o -> 101 o -> 108 l -> 108 a -> 97
The output for the file looks like this

104,101,108,108,97

<img width="2940" height="1912" alt="image" src="https://github.com/user-attachments/assets/4a4585b6-1f8d-4705-912d-d32c77d53d1f" />



Code 2: Number Converter

This program accepts a number in binary, decimal, octal, or hexadecimal and converts it into all four number systems. First, the program asks the user to enter a number and specify its original number system. Since Python initially stores the input as text, the program converts it into a numerical value using the appropriate base: 2 for binary, 10 for decimal, 8 for octal, or 16 for hexadecimal. The .lower() method makes the input consistent by converting responses such as BINARY, Binary, and binary into lowercase. Finally, the program displays the value in binary, decimal, octal, and hexadecimal form.

The program’s output looks like this:

<img width="2940" height="1912" alt="image" src="https://github.com/user-attachments/assets/b7c3d01e-80ad-4493-8a95-6a4004ab056a" />



Code #3: Image to Text

This program opens an image called smiley.png using Java’s ImageIO class and stores it as a BufferedImage. The convert() method gets the red, green, and blue values of each pixel and checks whether they match one of four known colors. Each known color is represented by a letter: R for red, B for black, W for white, and Y for yellow. If a pixel does not match one of these colors, the method returns its complete RGB value.

The nested loops examine every pixel from left to right and top to bottom. Each converted pixel value is written to output.txt, with spaces between pixels and a new line after every row of the image. Finally, the program closes the output file and prints a message confirming that the image was converted successfully. If the image cannot be read or the output file cannot be written, the program displays an error message.

smiley.png is this image -> 
<img width="6" height="6" alt="smiley" src="https://github.com/user-attachments/assets/cf56a555-8cf9-43b3-870e-ac7ee9fe8a53" />


The output for this is 

 R R R R R R R R R R 
R B B B B B B B B B R 
R B Y Y Y Y Y Y Y B R 
R B Y B Y Y Y B Y B R 
R B Y Y Y Y Y Y Y B R 
R B Y Y Y B Y Y Y B R 
R B Y B Y Y Y B Y B R 
R B Y B B B B B Y B R 
R B Y Y Y Y Y Y Y B R 
R B B B B B B B B B R 
R R R R R R R R R R R 




Code #4: Text to image

This program reads a text file containing pixel codes and uses those codes to create an image. First, it imports the Image class from the Pillow library. The convert() function translates each pixel code into an RGB color value. The letter R represents red, B represents black, and Y represents yellow. Any unrecognized code is converted to white.

The program opens awesome_picture.txt and stores all its lines. It calculates the image’s height using the number of lines and its width using the number of pixel codes in the first line. It then creates a blank RGB image. The nested loops move through every row and column, convert each letter into a color, and place that color at the appropriate coordinate. Finally, the program saves the finished image as smiley2.png and displays it.

The input text file looks like this. 
R R R R R R R R R R R 
R B B B B B B B B B R 
R B Y Y Y Y Y Y Y B R 
R B Y B Y Y Y B Y B R 
R B Y Y Y Y Y Y Y B R 
R B Y Y Y B Y Y Y B R 
R B Y B Y Y Y B Y B R 
R B Y B B B B B Y B R 
R B Y Y Y Y Y Y Y B R 
R B B B B B B B B B R 
R R R R R R R R R R R 


image generated as an output is: 
<img width="11" height="11" alt="output" src="https://github.com/user-attachments/assets/f320e041-9a62-48d4-ae28-38a316f66360" />









