# Análisis Orientado a Objetos – LogiCarga

## 1. Identificación del Dominio

**Nombre del negocio:** LogiCarga  
**Tipo:** Empresa de transporte de carga terrestre

**Descripción:**  
Breve descripción del negocio, el tipo de servicios que presta y el objetivo del sistema desarrollado.

---

## 2. Objetos Identificados

### Objeto Principal: CargoShipment

**Descripción:**  
Explicación de qué representa esta clase dentro del sistema.

**Atributos:**
- shipmentCode (String)
- origin (String)
- destination (String)
- weightKg (double)
- distanceKm (int)
- refrigerated (boolean)
- delivered (boolean)

**Métodos:**
- printInfo()
- calculateEstimatedCost()
- getShipmentCode()
- setDelivered(boolean)
- changeDestination(String)
- getSummary()

---

### Objeto Secundario: Cliente

**Descripción:**  
Explicación del rol del cliente en el sistema.

**Atributos:**
- clientId (String)
- name (String)
- nitOrId (String)
- phone (String)
- address (String)

**Métodos:**
- showInfo()
- makePayment(double, String)
- contact(String)
- getClientId()

---

### Objeto Complementario: Vehiculo

**Descripción:**  
Representa el medio de transporte utilizado para los envíos.

**Atributos:**
- placa (String)
- tipo (String)
- capacidadKg (double)

**Métodos:**
- validarCapacidad(double)
- getters y setters

---

### Objeto de Apoyo: Envio

**Descripción:**  
Modelo simplificado de un envío asociado a un vehículo.

**Atributos:**
- codigo (String)
- peso (double)
- destino (String)
- vehiculo (Vehiculo)

**Métodos:**
- calcularCosto()
- obtenerResumen()
- getters y setters

---

### Clase de Control: Main

**Descripción:**  
Clase principal que ejecuta el sistema.

**Responsabilidades:**
- Crear objetos del sistema
- Ejecutar métodos
- Mostrar resultados
- Integrar todas las clases

---

## 3. Relaciones entre Clases

- Relación entre Cliente y envíos
- Asociación entre Envio y Vehiculo
- Uso de CargoShipment para envíos complejos
- Main como coordinador del sistema

---

## 4. Justificación Orientada a Objetos

Explicación de cómo el sistema aplica:
- Encapsulación
- Modularidad
- Reutilización
- Mantenibilidad
- Claridad del modelo

---

## 5. Estado Actual del Proyecto

- Clases implementadas
- Ejecución correcta desde Main
- Código organizado por paquetes
- Documentación completa

---

## Conclusión

Resumen final del diseño orientado a objetos y del cumplimiento de los objetivos del proyecto.
