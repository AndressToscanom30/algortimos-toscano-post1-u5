# Librería de Grafos en Java (BFS y DFS)

## 📌 Descripción

Este proyecto implementa una librería de grafos en Java, incluyendo:

- Lista de adyacencia
- Matriz de adyacencia
- BFS (Breadth-First Search)
- DFS (Depth-First Search)

Se valida mediante pruebas unitarias y se analiza el rendimiento con JMH.

---

## ⚙️ Requisitos

- Java 17+
- Maven

---

## ▶️ Ejecutar pruebas

```bash
mvn test
```

---

## 🚀 Ejecutar benchmark

```bash
mvn clean package
java -jar target/benchmarks.jar
```

---

## 📊 Resultados

| Representación | Densidad | Tiempo (ms/op) |
|--------------|--------|----------------|
| Lista        | sparse | 0.008 ± 0.003 |
| Lista        | medium | 0.032 ± 0.010 |
| Lista        | dense  | 0.305 ± 0.158 |
| Matriz       | sparse | 0.191 ± 0.215 |
| Matriz       | medium | 0.246 ± 0.240 |
| Matriz       | dense  | 1.022 ± 0.565 |

---

## 📈 Análisis

- La lista de adyacencia es significativamente más eficiente en grafos dispersos.
- A medida que aumenta la densidad, el tiempo de ejecución crece en ambas representaciones.
- La matriz de adyacencia presenta mayor costo debido a que recorre todos los vértices en cada paso.

### Comparación directa:

- Sparse:
  - Lista: 0.008 ms/op
  - Matriz: 0.191 ms/op

- Medium:
  - Lista: 0.032 ms/op
  - Matriz: 0.246 ms/op

- Dense:
  - Lista: 0.305 ms/op
  - Matriz: 1.022 ms/op

👉 En todos los casos, la lista de adyacencia es más rápida.

---

## 🧠 Conclusiones

- La lista de adyacencia es la mejor opción para grafos dispersos.
- La matriz de adyacencia tiene un costo mayor debido a su complejidad O(V²).
- Incluso en grafos densos, la lista mantiene mejor rendimiento.
- Los resultados experimentales confirman la teoría.

---

## 🧪 Consideraciones

- Benchmarks ejecutados de forma aislada
- Sin procesos concurrentes
- Resultados confiables

---

## 📂 Estructura

```
src/
├── main/java/com/grafos/
├── test/java/com/grafos/
```

---

## ✅ Funcionalidades

- Grafos genéricos
- BFS con distancias
- DFS completo
- Detección de ciclos
- Benchmark con JMH
