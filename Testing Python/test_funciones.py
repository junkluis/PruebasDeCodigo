from proyecto.funciones import quick_sort
import unittest

class test_funciones_principales(unittest.TestCase):

    '''Prueba de quick_sort
        esceario: Ingresa un una lista de arreglos
        desordenadas y los retorna arreglados
    '''
    def test_quick_sort(self):
        arreglo_prueba = [3,2,5,1,4]
        resultado_esperado = [1,2,3,4,5]
        self.assertEqual(quick_sort(arreglo_prueba), resultado_esperado)

    '''Prueba de quick_sort
        esceario: No ingresa un arreglo, ingresa
        un String
    '''
    def test_qs_string_exeption(self):
        saludo = "hola"
        resultado_esperado = "No puedo orderna palabras"
        self.assertEqual(quick_sort(saludo), resultado_esperado)

    '''Prueba de quick_sort
        esceario: No ingresa un arreglo, ingresa
        un String
    '''
    def test_qs_int_exception(self):
        primo = 19
        resultado_esperado = "l"
        self.assertEqual(quick_sort(primo), resultado_esperado)

if __name__ == '__main__':
    unittest.main()
