@echo off
git add -A

for /f "tokens=2 delims==" %%a in ('wmic OS Get localdatetime /value') do set "dt=%%a"
set "YY=%dt:~0,4%" & set "MM=%dt:~4,2%" & set "DD=%dt:~6,2%"
set "HH=%dt:~8,2%" & set "Min=%dt:~10,2%" & set "Sec=%dt:~12,2%"

set "fullstamp=%YY%/%MM%/%DD% %HH%:%Min%:%Sec%"
git commit -a -m "Updated on: %fullstamp%"
git remote add origin "https://github.com/CommanderKV/Java-COMP1008G-WAB.git" 2>NUL


echo ------------------------------------------------------------
git push
echo ------------------------------------------------------------
 
pause