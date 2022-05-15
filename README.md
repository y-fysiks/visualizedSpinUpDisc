# visualizedSpinUpDisc

This is an extension of the work of https://github.com/YNWAcoder. I thought I'd visualize it in Java instead of relying on CSVs and the sort. 
This app uses JavaFX in Java 17 and I recommend Intellij to run it. If you don't have the Java 17 JDK, you can download the openJDK from Intellij directly. 

![image](https://user-images.githubusercontent.com/71800893/168454236-d356e048-6948-4cfe-856c-8954bae6221b.png)

## Original readme: 
This is a code adopted from a paper published by V. R. Morrison (https://web.mit.edu/womens-ult/www/smite/frisbee_physics.pdf) to model the flight of a disc for the Vex Robotics Game: Spin Up

This code was taken from the paper mentioned above. It was then modified by me. However, I had lots of help from those on the vex forum (https://www.vexforum.com/t/spin-up-kinematics-graphing-tool/102551/58) and I could not have made this without them.

The original paper is available in this repository and is called: frisbee_physics.pdf

If someone who is not faimilar with Java wishes to test this, I recomend IntelliJ: https://www.jetbrains.com/idea/. In order to use the code to its full extent, Excel can be used to manipulate the .csv file that is created by the program.

### IMPORTANT NOTE: 
As of now, the lift and drag coefficients are the same as the ones published in the paper. These could be different for the foam disks used in Spin Up. Therefore, take this model with a grain of salt. 
