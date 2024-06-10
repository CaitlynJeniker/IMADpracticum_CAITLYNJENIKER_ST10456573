hi im Caitlyn jeniker ST10456573
ABOUT THE WEATHER APP
I needed to create an app that not only provides the average temperature for the week but also allows users to view detailed information for each day.​

To create this app I used Android Studio. I started off with in empty view activity. I completed the layouts first then went on with the coding of the screens. Testing was done on the emulator. I used GitHub also.​

DISCLAIMER: MY APP DOES NOT RUN. I HAVE TO MANY ERRORS​. 

​for my 1st screen
 ![image](https://github.com/CaitlynJeniker/IMADpracticum_CAITLYNJENIKER_ST10456573/assets/164025680/9cc2661c-09ee-445e-a8a4-d24ca988e02d)
  The first screen is the splash screen, it introduces the user to the name of the App and it has to buttons​
1 to exit the app ​

1 to enter the mainpage​

For my second screen
![image](https://github.com/CaitlynJeniker/IMADpracticum_CAITLYNJENIKER_ST10456573/assets/164025680/75c07a6b-433f-4b61-8a50-b56de982e0e1)
using the same background
The user inserts their data:​

The day​:----------------------

The maximum temperature​:---------------------------

The minimum temperature​:------------------------------------

Lastly the weather conditions​:-----------------------------------------------

​The user then clicks that add data button which adds the data to the next screen ​

The user will then click view to the go to the next screen to see the outcome

for my thired screen
![image](https://github.com/CaitlynJeniker/IMADpracticum_CAITLYNJENIKER_ST10456573/assets/164025680/fd46aba1-4b32-44cb-bbf8-f5cf095fc088)
As you can see my app does not run but ill guide you on what is supposed to show on the screen​:

​The user is now on the detailed view screen where all their data the inserted is now displayed to them in a table form. 
They can also clear the data by clicking on the clear button or the user can return to the previous screen by using the main page button


This is a flowchart of the app
Start
|
v
Display Welcome Screen
|
v
User selects option:
- View Current Weather
- View Forecast
- select the min and max temperature
|
v
If "View Current Weather" is selected:
|
v
Fetch Location
|
v
Fetch Current Weather Data
|
v
Display Current Weather
|
v
End
|
v
If "View Forecast" is selected:
|
v
Fetch Location
|
v
Fetch Forecast Weather Data
|
v
Display Forecast
|
v
End
|
v
If "Settings" is selected:
|
v
Display Settings Options
|
v
User updates settings
|
v
Save Settings
|
v
End
|
v
Handle Errors:
- Display Error Message
- Retry or Go Back
|
v
End

PSEUDOCDE FOR THE APP
Start

DisplayWelcomeScreen()

userOption = GetUserOption()

if userOption == "View Current Weather":
    DisplayCurrentWeather()
    
elseif userOption == "View Forecast":
    DisplayForecast()
    
elseif userOption == "Settings":
    UpdateSettings()
    
else:
    DisplayErrorMessage("Invalid option selected")
    RetryOrGoBack()
    
End



POWERPOINT LINK:[IMADpracticum-ST10456573-CAITLYNJENIKER.pptx](https://github.com/user-attachments/files/15773989/IMADpracticum-ST10456573-CAITLYNJENIKER.pptx)























