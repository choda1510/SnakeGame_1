@echo off
forfiles /P . /S /M *.java /C "cmd /c echo @relpath" >> 2changeSlash.txt
