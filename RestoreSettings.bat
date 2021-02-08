@echo off
rem This batch file restores AceMoney settings
rem from previously saved file AceMoneySettings.reg to registry

regedit AceMoneySettings.reg

if not exist "%APPDATA%\MechCAD\AceMoney" mkdir "%APPDATA%\MechCAD\AceMoney"

copy /Y config.ini "%APPDATA%\MechCAD\AceMoney\"
