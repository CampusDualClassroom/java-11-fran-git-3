package com.campusdual.classroom;
public class Exercise11 {
    public static void main(String[] args) {
        // Crear una instancia de TVRemote
        TVRemote TVRemote = new TVRemote("Negro");

        // Encender la TV
        TVRemote.turnOn();
        System.out.println("Encender la TV: " + TVRemote.on);

        // Subir un canal
        TVRemote.channelUp();
        System.out.println("Canal + -> " + TVRemote.channel);

        // Bajar un canal
        TVRemote.channelDown();
        System.out.println("Canal - -> " + TVRemote.channel);

        // Establecer el canal en 0
        TVRemote.channel = 0;
        System.out.println("Canal: " + TVRemote.channel);

        // Intentar bajar un canal y comprobar que no se puede
        TVRemote.channelDown();
        System.out.println("Canal - Pero ya era 0, por lo tanto canal = " + TVRemote.channel);

        // Subir el volumen
        TVRemote.volumeUp();
        System.out.println("Volumen + -> " + TVRemote.volume);

        // Bajar el volumen
        TVRemote.volumeDown();
        System.out.println("Volumen - -> " + TVRemote.volume);

        // Establecer el volumen en 0
        TVRemote.volume = 0;
        System.out.println("Volumen: " + TVRemote.volume);

        // Intentar bajar el volumen y comprobar que no se puede
        TVRemote.volumeDown();
        System.out.println("Volumen 0. No se puede bajar más, volumen -> " + TVRemote.volume);

        // Obtener el color del mando a distancia y mostrarlo por pantalla
        System.out.println("Color de mando: " + TVRemote.color);

        // Apagar la TV
        TVRemote.turnOff();
        System.out.println("Apagando TV: " + TVRemote.on);
    }
}
