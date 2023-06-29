import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        boolean continuarPrograma = true;
        while (continuarPrograma) {
            Object[] options = { "Conversor de Monedas", "Conversor de Temperatura", "Conversor de Tiempo", 
                "Conversor de Velocidad", "Conversor de Peso/Masa", "Conversor de Volumen", "Salir" };
            int choice = JOptionPane.showOptionDialog(null, "¿Qué conversor desea utilizar ?", "Convertir",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            if (choice == 6) {
                JOptionPane.showMessageDialog(null, "Programa Cerrado");
                System.exit(0);
            }

            if (choice == 0) {
                DecimalFormat FormatearDecimal = new DecimalFormat("#.##");
                boolean continuarMonedas = true;
                while (continuarMonedas) {
                    String[] opciones = {
                            "Sol peruano a Euros",
                            "Sol peruano a Dólares",
                            "Sol peruano a Libras Esterlinas",
                            "Sol peruano a Yen",
                            "Sol peruano a Won",
                            "Sol peruano a Francos Suizos",
                            "Sol peruano a Pesos Mexicanos"
                    };
                    String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                            "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                    if (cambio == null) {
                        break; // Regresar al menú principal
                    }

                    String input = JOptionPane.showInputDialog("Ingrese la cantidad en soles peruanos: ");
                    double soles;
                    try {
                        soles = Double.parseDouble(input);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor no válido.");
                        return;
                    }

                    double resultado = 0;
                    if (cambio.equals("Sol peruano a Dólares")) {
                        resultado = soles / 3.58;
                        JOptionPane.showMessageDialog(null,
                                soles + " soles peruanos son " + FormatearDecimal.format(resultado) + " dólares.");
                    } else if (cambio.equals("Sol peruano a Euros")) {
                        resultado = soles / 4.21;
                        JOptionPane.showMessageDialog(null, soles + " soles peruanos son " + resultado + " euros.");
                    } else if (cambio.equals("Sol peruano a Libras Esterlinas")) {
                        resultado = soles / 4.92;
                        JOptionPane.showMessageDialog(null,
                                soles + " soles peruanos son " + resultado + " libras esterlinas.");
                    } else if (cambio.equals("Sol peruano a Yen")) {
                        resultado = soles / 0.03;
                        JOptionPane.showMessageDialog(null,
                                soles + " soles peruanos son " + resultado + " yenes japoneses.");
                    } else if (cambio.equals("Sol peruano a Won")) {
                        resultado = soles / 0.0027;
                        JOptionPane.showMessageDialog(null,
                                soles + " soles peruanos son " + resultado + " wones surcoreanos.");
                    } else if (cambio.equals("Sol peruano a Francos Suizos")) {
                        resultado = soles / 3.86;
                        JOptionPane.showMessageDialog(null,
                                soles + " soles peruanos son " + FormatearDecimal.format(resultado) + " francos suizos.");
                    } else if (cambio.equals("Sol peruano a Pesos Mexicanos")) {
                        resultado = soles / 0.18;
                        JOptionPane.showMessageDialog(null,
                                soles + " soles peruanos son " + resultado + " pesos mexicanos.");
                    }

                    int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando este conversor?",
                            "Confirmar", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.NO_OPTION) {
                        continuarMonedas = false;
                        JOptionPane.showMessageDialog(null, "Conversor Finalizado");
                    }
                }
            }
   if (choice == 1) {
    boolean SeguirPrograma = true;
    while (SeguirPrograma) {
        String[] opciones = { "Celsius a Fahrenheit", "Fahrenheit a Celsius", "Celsius a Kelvin",
                "Kelvin a Celsius" };
        String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                "Conversor de Temperatura", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (cambio == null) {
            break; // Regresar al menú principal
        }

        String input = JOptionPane.showInputDialog("Ingrese la cantidad: ");
        double cantidad;
        try {
            cantidad = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor no válido.");
            return;
        }

        double resultado = 0;
        if (cambio.equals("Celsius a Fahrenheit")) {
            resultado = (cantidad * 9 / 5) + 32;
            JOptionPane.showMessageDialog(null,
                    cantidad + " grados Celsius son " + resultado + " grados Fahrenheit");
        } else if (cambio.equals("Fahrenheit a Celsius")) {
            resultado = (cantidad - 32) * 5 / 9;
            JOptionPane.showMessageDialog(null,
                    cantidad + " grados Fahrenheit son " + resultado + " grados Celsius");
        } else if (cambio.equals("Celsius a Kelvin")) {
            resultado = cantidad + 273.15;
            JOptionPane.showMessageDialog(null,
                    cantidad + " grados Celsius son " + resultado + " grados Kelvin");
        } else if (cambio.equals("Kelvin a Celsius")) {
            resultado = cantidad - 273.15;
            JOptionPane.showMessageDialog(null,
                    cantidad + " grados Kelvin son " + resultado + " grados Celsius");
        }

        int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar usando este conversor?", "",
                JOptionPane.YES_NO_CANCEL_OPTION);
        if (continuar == JOptionPane.NO_OPTION || continuar == JOptionPane.CANCEL_OPTION) {
            SeguirPrograma = false;
            JOptionPane.showMessageDialog(null, "Conversor Finalizado");
        }
    }
}


            if (choice == 2) {
                boolean continuarTiempo = true;
                while (continuarTiempo) {
                    String[] opciones = { "Horas a Minutos", "Horas a Segundos", "Minutos a Horas", "Minutos a Segundos",
                            "Segundos a Horas", "Segundos a Minutos" };
                    String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                            "Conversor de Tiempo", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                    if (cambio == null) {
                        break; // Regresar al menú principal
                    }

                    String input = JOptionPane.showInputDialog("Ingrese la cantidad: ");
                    double cantidad;
                    try {
                        cantidad = Double.parseDouble(input);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor no válido.");
                        return;
                    }

                    double resultado = 0;
                    if (cambio.equals("Horas a Minutos")) {
                        resultado = cantidad * 60;
                        JOptionPane.showMessageDialog(null,
                                cantidad + " horas son " + resultado + " minutos.");
                    } else if (cambio.equals("Horas a Segundos")) {
                        resultado = cantidad * 60 * 60;
                        JOptionPane.showMessageDialog(null,
                                cantidad + " horas son " + resultado + " segundos.");
                    } else if (cambio.equals("Minutos a Horas")) {
                        resultado = cantidad / 60;
                        JOptionPane.showMessageDialog(null,
                                cantidad + " minutos son " + resultado + " horas.");
                    } else if (cambio.equals("Minutos a Segundos")) {
                        resultado = cantidad * 60;
                        JOptionPane.showMessageDialog(null,
                                cantidad + " minutos son " + resultado + " segundos.");
                    } else if (cambio.equals("Segundos a Horas")) {
                        resultado = cantidad / 60 / 60;
                        JOptionPane.showMessageDialog(null,
                                cantidad + " segundos son " + resultado + " horas.");
                    } else if (cambio.equals("Segundos a Minutos")) {
                        resultado = cantidad / 60;
                        JOptionPane.showMessageDialog(null,
                                cantidad + " segundos son " + resultado + " minutos.");
                    }

                    int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando este conversor?",
                            "Confirmar", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.NO_OPTION) {
                        continuarTiempo = false;
                        JOptionPane.showMessageDialog(null, "Conversor Finalizado");
                    }
                }
            }
if (choice == 3) {
    boolean continuarVelocidad = true;
    while (continuarVelocidad) {
        String[] opciones = {
                "Kilómetros por hora a Metros por segundo",
                "Metros por segundo a Kilómetros por hora",
                "Metros por segundo a Millas por hora",
                "Millas por hora a Metros por segundo"
        };
        String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                "Conversor de Velocidad", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (cambio == null) {
            break; // Regresar al menú principal
        }

        String input = JOptionPane.showInputDialog("Ingrese la velocidad: ");
        double velocidad;
        try {
            velocidad = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor no válido.");
            return;
        }

        double resultado = 0;
        if (cambio.equals("Kilómetros por hora a Metros por segundo")) {
            resultado = velocidad / 3.6;
            JOptionPane.showMessageDialog(null,
                    velocidad + " kilómetros por hora son " + resultado + " metros por segundo.");
        } else if (cambio.equals("Metros por segundo a Kilómetros por hora")) {
            resultado = velocidad * 3.6;
            JOptionPane.showMessageDialog(null,
                    velocidad + " metros por segundo son " + resultado + " kilómetros por hora.");
        } else if (cambio.equals("Metros por segundo a Millas por hora")) {
            resultado = velocidad * 2.23694;
            JOptionPane.showMessageDialog(null,
                    velocidad + " metros por segundo son " + resultado + " millas por hora.");
        } else if (cambio.equals("Millas por hora a Metros por segundo")) {
            resultado = velocidad / 2.23694;
            JOptionPane.showMessageDialog(null,
                    velocidad + " millas por hora son " + resultado + " metros por segundo.");
        }

        int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando este conversor?",
                "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.NO_OPTION) {
            continuarVelocidad = false;
            JOptionPane.showMessageDialog(null, "Conversor Finalizado");
        }
    }
}
            if (choice == 4) {
                 boolean continuarPesoMasa = true;
                while (continuarPesoMasa) {
                    String[] opcionesPesoMasa = { "Kilogramos a Libras", "Libras a Kilogramos", "Gramos a Onzas",
                            "Onzas a Gramos", "Toneladas métricas a Libras", "Libras a Toneladas métricas" };
                    String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                            "Conversor de Peso/Masa", JOptionPane.QUESTION_MESSAGE, null, opcionesPesoMasa,
                            opcionesPesoMasa[0]);

                    if (cambio == null) {
                        break; // Regresar al menú principal
                    }

                    String input = JOptionPane.showInputDialog("Ingrese el valor: ");
                    double valor;
                    try {
                        valor = Double.parseDouble(input);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor no válido.");
                        return;
                    }

                    double resultado = 0;
                    if (cambio.equals("Kilogramos a Libras")) {
                        resultado = valor * 2.20462;
                        JOptionPane.showMessageDialog(null,
                                valor + " kilogramos son " + resultado + " libras.");
                    } else if (cambio.equals("Libras a Kilogramos")) {
                        resultado = valor * 0.453592;
                        JOptionPane.showMessageDialog(null,
                                valor + " libras son " + resultado + " kilogramos.");
                    } else if (cambio.equals("Gramos a Onzas")) {
                        resultado = valor * 0.035274;
                        JOptionPane.showMessageDialog(null,
                                valor + " gramos son " + resultado + " onzas.");
                    } else if (cambio.equals("Onzas a Gramos")) {
                        resultado = valor * 28.3495;
                        JOptionPane.showMessageDialog(null,
                                valor + " onzas son " + resultado + " gramos.");
                    } else if (cambio.equals("Toneladas métricas a Libras")) {
                        resultado = valor * 2204.62;
                        JOptionPane.showMessageDialog(null,
                                valor + " toneladas métricas son " + resultado + " libras.");
                    } else if (cambio.equals("Libras a Toneladas métricas")) {
                        resultado = valor * 0.000453592;
                        JOptionPane.showMessageDialog(null,
                                valor + " libras son " + resultado + " toneladas métricas.");
                    }

                    int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando este conversor?",
                            "Confirmar", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.NO_OPTION) {
                        continuarPesoMasa = false;
                        JOptionPane.showMessageDialog(null, "Conversor Finalizado");
                    }
                }
            }
              if (choice == 5) {
                boolean continuarVolumen = true;
                while (continuarVolumen) {
                    String[] opcionesVolumen = { "Litros a Galones", "Galones a Litros",
                            "Centímetros cúbicos a Onzas líquidas", "Onzas líquidas a Centímetros cúbicos",
                            "Metros cúbicos a Pies cúbicos", "Pies cúbicos a Metros cúbicos" };
                    String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                            "Conversor de Volumen", JOptionPane.QUESTION_MESSAGE, null, opcionesVolumen,
                            opcionesVolumen[0]);

                    if (cambio == null) {
                        break; // Regresar al menú principal
                    }

                    String input = JOptionPane.showInputDialog("Ingrese el valor: ");
                    double valor;
                    try {
                        valor = Double.parseDouble(input);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor no válido.");
                        return;
                    }

                    double resultado = 0;
                    if (cambio.equals("Litros a Galones")) {
                        resultado = valor * 0.264172;
                        JOptionPane.showMessageDialog(null, valor + " litros son " + resultado + " galones.");
                    } else if (cambio.equals("Galones a Litros")) {
                        resultado = valor * 3.78541;
                        JOptionPane.showMessageDialog(null, valor + " galones son " + resultado + " litros.");
                    } else if (cambio.equals("Centímetros cúbicos a Onzas líquidas")) {
                        resultado = valor * 0.033814;
                        JOptionPane.showMessageDialog(null,
                                valor + " centímetros cúbicos son " + resultado + " onzas líquidas.");
                    } else if (cambio.equals("Onzas líquidas a Centímetros cúbicos")) {
                        resultado = valor * 29.5735;
                        JOptionPane.showMessageDialog(null,
                                valor + " onzas líquidas son " + resultado + " centímetros cúbicos.");
                    } else if (cambio.equals("Metros cúbicos a Pies cúbicos")) {
                        resultado = valor * 35.3147;
                        JOptionPane.showMessageDialog(null,
                                valor + " metros cúbicos son " + resultado + " pies cúbicos.");
                    } else if (cambio.equals("Pies cúbicos a Metros cúbicos")) {
                        resultado = valor * 0.0283168;
                        JOptionPane.showMessageDialog(null,
                                valor + " pies cúbicos son " + resultado + " metros cúbicos.");
                    }

                    int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando este conversor?",
                            "Confirmar", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.NO_OPTION) {
                        continuarVolumen = false;
                        JOptionPane.showMessageDialog(null, "Conversor Finalizado");
                    }
                }
            }

            if (choice == 6) {
                continuarPrograma = false;
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
            }
        }
    }
}