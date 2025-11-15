public class Main {
    public static void main(String[] args) {
        System.out.println("SISTEMA JARDIN DE NIÑOS - 3 CLASES");
        System.out.println("===================================");

        // 1. CREAR OBJETOS
        System.out.println("CREANDO REGISTROS...");

        // Crear niños
        Niño niño1 = new Niño("Ana Garcia", 4, "Abejitas", "Laura Garcia", "555-1111");
        Niño niño2 = new Niño("Carlos Lopez", 5, "Ositos", "Maria Lopez", "555-2222");

        // Crear maestros
        Maestros maestro1 = new Maestros("Maria Gonzalez", "Educacion Preescolar", 8, "Abejitas");
        Maestros maestro2 = new Maestros("Pedro Martinez", "Educacion Fisica", 5, "Ositos");

        // Crear materias
        Materias materia1 = new Materias("Lectura Basica", "Lenguaje", "Basica", "Libros, lapices, cuadernos");
        Materias materia2 = new Materias("Numeros y Formas", "Matematicas", "Basica", "Bloques, figuras geometricas");
        Materias materia3 = new Materias("Arte y Creatividad", "Arte", "Intermedia", "Pinturas, pinceles, papel");

        // 2. MOSTRAR INFORMACION
        System.out.println("\nINFORMACION DE NIÑOS:");
        System.out.println(niño1.obtenerInformacion());
        System.out.println(niño2.obtenerInformacion());

        System.out.println("\nINFORMACION DE MAESTROS:");
        System.out.println(maestro1.obtenerInformacion());
        System.out.println(maestro2.obtenerInformacion());

        System.out.println("\nMATERIAS DEL JARDIN:");
        System.out.println(materia1.obtenerInformacion());
        System.out.println(materia2.obtenerInformacion());
        System.out.println(materia3.obtenerInformacion());

        // 3. METODOS DE NEGOCIO
        System.out.println("\nINFORMACION ADICIONAL:");
        System.out.println("Puede Ana leer? " + niño1.puedeLeer());
        System.out.println("Es Maria titular? " + maestro1.esTitular());
        System.out.println("Lectura Basica es para preescolar? " + materia1.esParaPreescolar());

        // 4. USAR GETTERS Y SETTERS
        System.out.println("\nMODIFICANDO INFORMACION...");
        niño1.setEdad(5);
        materia1.setDificultad("Intermedia");

        System.out.println("Ana ahora tiene: " + niño1.getEdad() + " años");
        System.out.println("Nueva dificultad de Lectura: " + materia1.getDificultad());

        System.out.println("\nSISTEMA COMPLETADO EXITOSAMENTE!");
    }
}