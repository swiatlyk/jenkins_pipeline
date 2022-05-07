def checkoutSmokeFiles() {
    git credentialsId: 'SvccpmdaiVeh_ssh', url: 'ssh://git@stash1.harman.com:7999/n6h_automation/smokefiles.git'
}

def vcpupdate() {
    echo "Starting VCPUpdate"
    sleep(2)
    //code logic here
}

def smoketests_exe() {
    echo "Starting SmokeTests.exe with parameters"
    sleep(2)
    //code logic here
}

def copySourceDestination(){
    //bat("xcopy %SOURCE% %DESTINATION% /s /e /y")
    bat returnStatus: true, script: '''if [%SOURCE%] == [] goto EMPTYS
    if [%DESTINATION%] == [] goto EMPTYD

    xcopy %SOURCE% %DESTINATION% /s /e /y
    
    cd /d %DESTINATION%\\
    
    if "%FRUP%" == "" goto END
    
    if "%FRUP%" == "NTG6FRUP1" (
      echo "Nothing to do"
    )
    
    goto END
    
    :EMPTYS
    echo prod_copy_smokefiles=1 >> flags.txt
    echo "Empty source folder!"
    exit /b 11
    
    :EMPTYD
    echo prod_copy_smokefiles=1 >> flags.txt
    echo "Empty destination folder!"
    exit /b 11
    
    :END
    echo prod_copy_smokefiles=0 >> flags.'''
}
return this