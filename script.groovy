def checkoutApplication() {
    git credentialsId: 'id_of_stored_credential_in_jenkins_server', url: 'ssh://git@address_of_the_repository/name_of_repository.git'
}

def precondition() {
    echo "Starting VCPUpdate"
    sleep(1)
    //code logic here
}

def application_exe() {
    echo "Starting application.exe with parameters"
    sleep(1)
    //code logic here
}

def copySourceDestination(){
    //bat("xcopy %SOURCE% %DESTINATION% /s /e /y")
    // bat returnStatus: true, script: '''if [%SOURCE%] == [] goto EMPTYS
    // if [%DESTINATION%] == [] goto EMPTYD

    // xcopy %SOURCE% %DESTINATION% /s /e /y
    
    // cd /d %DESTINATION%\\
    
    // if "%FRUP%" == "" goto END
    
    // if "%FRUP%" == "NTG6FRUP1" (
    //   echo "Nothing to do"
    // )
    
    // goto END
    
    // :EMPTYS
    // echo "Empty source folder!"
    // exit /b 11
    
    // :EMPTYD
    // echo "Empty destination folder!"
    // exit /b 11
    
    // :END
    // echo "End of file"'''
}
return this