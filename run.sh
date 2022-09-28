clear
cd EjemplosClase
printf "Compiling..."
javac -d bin src/consola/*.java 
if [ $? == 0 ] 
then
    clear
    java -cp bin consola.Array
else
    printf "\n\n\nError - Exit code $?"
fi
