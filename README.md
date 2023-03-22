# HemeBiotech Analytics

<p align="center">
  <img src=https://user-images.githubusercontent.com/95872501/226888303-f24c3bad-9a40-4c7f-8be2-619d8dc28de9.png>
</p>

# Goal

Take as input a list of symptoms in the form of a text file named `symptoms.txt` and generate as output a list of each symptom without duplicates followed by their number of occurrences in a file named `results.out`.

<p align="center">
  <img src=https://user-images.githubusercontent.com/95872501/226888486-b5ee85ef-144e-435c-9e12-14a96fa31562.png>
</p>

# Solution

The program is mainly composed by 4 interfaces and 4 classes that implement them. 
Each interface declares a method which represents a distinct step to pass from an input list to another output list : `reader`, `counter`, `sorter` and `writer`.
