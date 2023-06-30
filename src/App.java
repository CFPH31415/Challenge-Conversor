import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        boolean continuarPrograma = true;
        while (continuarPrograma) {
            Object[] options = { "Conversor de Monedas", "Conversor de Temperatura", "Conversor de Tiempo", 
                "Conversor de Velocidad", "Conversor de Peso/Masa", "Conversor de Volumen", "Salir" };
            String choice = (String) JOptionPane.showInputDialog(null, "¿Qué conversor desea utilizar ?", "Convertir",
                    JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (choice == null || choice.equals("Salir")) {
                JOptionPane.showMessageDialog(null, "Programa Cerrado");
                System.exit(0);
            }

            if (choice.equals("Conversor de Monedas")) {
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
                                soles + " soles peruanos son " + FormatearDecimal.format(resultado) + " pesos mexicanos.");
                    }

                    int continuar = JOptionPane.showConfirmDialog(null, "¿Desea hacer otra conversión de moneda?",
                            "Continuar", JOptionPane.YES_NO_OPTION);
                    if (continuar == JOptionPane.NO_OPTION) {
                        continuarMonedas = false;
                    }
                }
            }

            if (choice.equals("Conversor de Temperatura")) {
                boolean continuarTemperatura = true;
                while (continuarTemperatura) {
                    String[] opciones = { "Celsius a Fahrenheit", "Celsius a Kelvin", "Fahrenheit a Celsius",
                            "Fahrenheit a Kelvin", "Kelvin a Celsius", "Kelvin a Fahrenheit" };
                    String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                            "Conversor de Temperatura", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                    if (cambio == null) {
                        break; // Regresar al menú principal
                    }

                    String input = JOptionPane.showInputDialog("Ingrese el valor de temperatura: ");
                    double temperatura;
                    try {
                        temperatura = Double.parseDouble(input);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor no válido.");
                        return;
                    }

                    double resultado = 0;
                    if (cambio.equals("Celsius a Fahrenheit")) {
                        resultado = (temperatura * 9 / 5) + 32;
                        JOptionPane.showMessageDialog(null,
                                temperatura + " grados Celsius son " + resultado + " grados Fahrenheit.");
                    } else if (cambio.equals("Celsius a Kelvin")) {
                        resultado = temperatura + 273.15;
                        JOptionPane.showMessageDialog(null,
                                temperatura + " grados Celsius son " + resultado + " grados Kelvin.");
                    } else if (cambio.equals("Fahrenheit a Celsius")) {
                        resultado = (temperatura - 32) * 5 / 9;
                        JOptionPane.showMessageDialog(null,
                                temperatura + " grados Fahrenheit son " + resultado + " grados Celsius.");
                    } else if (cambio.equals("Fahrenheit a Kelvin")) {
                        resultado = (temperatura + 459.67) * 5 / 9;
                        JOptionPane.showMessageDialog(null,
                                temperatura + " grados Fahrenheit son " + resultado + " grados Kelvin.");
                    } else if (cambio.equals("Kelvin a Celsius")) {
                        resultado = temperatura - 273.15;
                        JOptionPane.showMessageDialog(null,
                                temperatura + " grados Kelvin son " + resultado + " grados Celsius.");
                    } else if (cambio.equals("Kelvin a Fahrenheit")) {
                        resultado = (temperatura * 9 / 5) - 459.67;
                        JOptionPane.showMessageDialog(null,
                                temperatura + " grados Kelvin son " + resultado + " grados Fahrenheit.");
                    }

                    int continuar = JOptionPane.showConfirmDialog(null, "¿Desea hacer otra conversión de temperatura?",
                            "Continuar", JOptionPane.YES_NO_OPTION);
                    if (continuar == JOptionPane.NO_OPTION) {
                        continuarTemperatura = false;
                    }
                }
            }

            if (choice.equals("Conversor de Tiempo")) {
                boolean continuarTiempo = true;
                while (continuarTiempo) {
                    String[] opciones = { "Segundos a Minutos", "Segundos a Horas", "Minutos a Segundos",
                            "Minutos a Horas", "Horas a Segundos", "Horas a Minutos" };
                    String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                            "Conversor de Tiempo", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                    if (cambio == null) {
                        break; // Regresar al menú principal
                    }

                    String input = JOptionPane.showInputDialog("Ingrese el valor de tiempo: ");
                    double tiempo;
                    try {
                        tiempo = Double.parseDouble(input);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor no válido.");
                        return;
                    }

                    double resultado = 0;
                    if (cambio.equals("Segundos a Minutos")) {
                        resultado = tiempo / 60;
                        JOptionPane.showMessageDialog(null,
                                tiempo + " segundos son " + resultado + " minutos.");
                    } else if (cambio.equals("Segundos a Horas")) {
                        resultado = tiempo / 3600;
                        JOptionPane.showMessageDialog(null,
                                tiempo + " segundos son " + resultado + " horas.");
                    } else if (cambio.equals("Minutos a Segundos")) {
                        resultado = tiempo * 60;
                        JOptionPane.showMessageDialog(null,
                                tiempo + " minutos son " + resultado + " segundos.");
                    } else if (cambio.equals("Minutos a Horas")) {
                        resultado = tiempo / 60;
                        JOptionPane.showMessageDialog(null, tiempo + " minutos son " + resultado + " horas.");
                    } else if (cambio.equals("Horas a Segundos")) {
                        resultado = tiempo * 3600;
                        JOptionPane.showMessageDialog(null,
                                tiempo + " horas son " + resultado + " segundos.");
                    } else if (cambio.equals("Horas a Minutos")) {
                        resultado = tiempo * 60;
                        JOptionPane.showMessageDialog(null, tiempo + " horas son " + resultado + " minutos.");
                    }

                    int continuar = JOptionPane.showConfirmDialog(null, "¿Desea hacer otra conversión de tiempo?",
                            "Continuar", JOptionPane.YES_NO_OPTION);
                    if (continuar == JOptionPane.NO_OPTION) {
                        continuarTiempo = false;
                    }
                }
            }

            if (choice.equals("Conversor de Velocidad")) {
                boolean continuarVelocidad = true;
                while (continuarVelocidad) {
                    String[] opciones = { "Metros por Segundo a Kilómetros por Hora",
                            "Kilómetros por Hora a Metros por Segundo", "Millas por Hora a Kilómetros por Hora",
                            "Kilómetros por Hora a Millas por Hora" };
                    String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                            "Conversor de Velocidad", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                    if (cambio == null) {
                        break; // Regresar al menú principal
                    }

                    String input = JOptionPane.showInputDialog("Ingrese el valor de velocidad: ");
                    double velocidad;
                    try {
                        velocidad = Double.parseDouble(input);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor no válido.");
                        return;
                    }

                    double resultado = 0;
                    if (cambio.equals("Metros por Segundo a Kilómetros por Hora")) {
                        resultado = velocidad * 3.6;
                        JOptionPane.showMessageDialog(null,
                                velocidad + " metros por segundo son " + resultado + " kilómetros por hora.");
                    } else if (cambio.equals("Kilómetros por Hora a Metros por Segundo")) {
                        resultado = velocidad / 3.6;
                        JOptionPane.showMessageDialog(null,
                                velocidad + " kilómetros por hora son " + resultado + " metros por segundo.");
                    } else if (cambio.equals("Millas por Hora a Kilómetros por Hora")) {
                        resultado = velocidad * 1.60934;
                        JOptionPane.showMessageDialog(null,
                                velocidad + " millas por hora son " + resultado + " kilómetros por hora.");
                    } else if (cambio.equals("Kilómetros por Hora a Millas por Hora")) {
                        resultado = velocidad / 1.60934;
                        JOptionPane.showMessageDialog(null,
                                velocidad + " kilómetros por hora son " + resultado + " millas por hora.");
                    }

                    int continuar = JOptionPane.showConfirmDialog(null, "¿Desea hacer otra conversión de velocidad?",
                            "Continuar", JOptionPane.YES_NO_OPTION);
                    if (continuar == JOptionPane.NO_OPTION) {
                        continuarVelocidad = false;
                    }
                }
            }

            if (choice.equals("Conversor de Peso/Masa")) {
                boolean continuarPeso = true;
                while (continuarPeso) {
                    String[] opciones = { "Kilogramos a Libras", "Libras a Kilogramos", "Gramos a Onzas",
                            "Onzas a Gramos" };
                    String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                            "Conversor de Peso/Masa", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                    if (cambio == null) {
                        break; // Regresar al menú principal
                    }

                    String input = JOptionPane.showInputDialog("Ingrese el valor de peso/masa: ");
                    double peso;
                    try {
                        peso = Double.parseDouble(input);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor no válido.");
                        return;
                    }

                    double resultado = 0;
                    if (cambio.equals("Kilogramos a Libras")) {
                        resultado = peso * 2.20462;
                        JOptionPane.showMessageDialog(null, peso + " kilogramos son " + resultado + " libras.");
                    } else if (cambio.equals("Libras a Kilogramos")) {
                        resultado = peso / 2.20462;
                        JOptionPane.showMessageDialog(null, peso + " libras son " + resultado + " kilogramos.");
                    } else if (cambio.equals("Gramos a Onzas")) {
                        resultado = peso * 0.035274;
                        JOptionPane.showMessageDialog(null, peso + " gramos son " + resultado + " onzas.");
                    } else if (cambio.equals("Onzas a Gramos")) {
                        resultado = peso / 0.035274;
                        JOptionPane.showMessageDialog(null, peso + " onzas son " + resultado + " gramos.");
                    }

                    int continuar = JOptionPane.showConfirmDialog(null, "¿Desea hacer otra conversión de peso/masa?",
                            "Continuar", JOptionPane.YES_NO_OPTION);
                    if (continuar == JOptionPane.NO_OPTION) {
                        continuarPeso = false;
                    }
                }
            }

            if (choice.equals("Conversor de Volumen")) {
                boolean continuarVolumen = true;
                while (continuarVolumen) {
                    String[] opciones = { "Litros a Galones", "Galones a Litros", "Centímetros Cúbicos a Onzas Líquidas",
                            "Onzas Líquidas a Centímetros Cúbicos" };
                    String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                            "Conversor de Volumen", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                    if (cambio == null) {
                        break; // Regresar al menú principal
                    }

                    String input = JOptionPane.showInputDialog("Ingrese el valor de volumen: ");
                    double volumen;
                    try {
                        volumen = Double.parseDouble(input);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor no válido.");
                        return;
                    }

                    double resultado = 0;
                    if (cambio.equals("Litros a Galones")) {
                        resultado = volumen * 0.264172;
                        JOptionPane.showMessageDialog(null, volumen + " litros son " + resultado + " galones.");
                    } else if (cambio.equals("Galones a Litros")) {
                        resultado = volumen / 0.264172;
                        JOptionPane.showMessageDialog(null, volumen + " galones son " + resultado + " litros.");
                    } else if (cambio.equals("Centímetros Cúbicos a Onzas Líquidas")) {
                        resultado = volumen * 0.033814;
                        JOptionPane.showMessageDialog(null,
                                volumen + " centímetros cúbicos son " + resultado + " onzas líquidas.");
                    } else if (cambio.equals("Onzas Líquidas a Centímetros Cúbicos")) {
                        resultado = volumen / 0.033814;
                        JOptionPane.showMessageDialog(null,
                                volumen + " onzas líquidas son " + resultado + " centímetros cúbicos.");
                    }

                    int continuar = JOptionPane.showConfirmDialog(null, "¿Desea hacer otra conversión de volumen?",
                            "Continuar", JOptionPane.YES_NO_OPTION);
                    if (continuar == JOptionPane.NO_OPTION) {
                        continuarVolumen = false;
                    }
                }
            }
        }
    }
}
