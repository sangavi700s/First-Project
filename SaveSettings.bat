@echo off
rem This batch file saves AceMoney settings
rem from the registry to file AceMoneySettings.reg in the current directory.

regedit /e AceMoneySettings.reg "HKEY_CURRENT_USER\Software\MechCAD\AceMoney"

copy /Y "%APPDATA%\MechCAD\AceMoney\config.ini" .
