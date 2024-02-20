@echo off
mkdir bin
cd classes
jar cvmf Manifest.txt ../bin/SnakeGame.jar .
cd ..
pause