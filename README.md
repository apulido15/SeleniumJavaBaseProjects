# SeleniumJavaBaseProJects

Repositorio base para proyectos de automatización de pruebas con **Selenium en Java**.  
Este proyecto sirve como **framework inicial** con buenas prácticas y herramientas clave para crear suites de pruebas mantenibles y escalables.


## Características principales
- **Java + Selenium 4** para automatización web.
- **TestNG** para la orquestación y reporte básico de pruebas.
- **Page Object Model (POM)** para mejorar mantenibilidad y reutilización.
- **Maven** para gestión de dependencias y ejecución.
- **Extent Reports** para reportes HTML enriquecidos.
- Ejecución en **modo headless** y en múltiples navegadores.


## Requisitos
- JDK 17+
- Maven 3.8+
- Google Chrome/Chromedriver (o el navegador/driver que vayas a usar)


## Estructura del proyecto
```
SeleniumJavaBaseProJects
│── src
│   ├── main
│   │   └── java      # Clases base, utilidades, configuraciones
│   └── test
│       └── java      # Casos de prueba organizados por módulos
│── testng.xml                # Configuración de TestNG Ejecución secuencial
│── testngData.xml            # Configuración de TestNG Ejecución secuencial con Dataproviders
│── testngParallel.xml        # Configuración de TestNG Ejecución paralela
│── testngParallelData.xml    # Configuración de TestNG Ejecución paralela con Dataproviders
│── pom.xml           # Configuración de Maven
│── README.md         # Documentación del proyecto
```

> La estructura puede variar según tu organización de paquetes.


## Ejecución de pruebas

### 1) Clonar el repositorio
```bash
git clone https://github.com/apulido15/SeleniumJavaBaseProjects.git
```

### 2) Ejecutar todo con Maven
```bash
mvn clean test
mvn clean test -DsuiteXmlFile=testngData.xml
mvn clean test -DsuiteXmlFile=testngParallel.xml
mvn clean test -DsuiteXmlFile=testngParallelData.xml
```

### 3) Ejecutar una clase de test específica
```bash
mvn clean test -Dtest=LoginTests
```

### 4) Ejecutar un método de test específico dentro de una clase
```bash
mvn clean test -Dtest=LoginTests#loginValido_debeEntrarAlInventario
```


## Reportes
- Reportes de **Surefire**: `target/surefire-reports/`  
- Reportes de **Extent** (si están configurados): `target/ExtentReports/`


## Configuración adicional
- Ajusta `testng.xml` para agrupar suites, paralelizar o filtrar por grupos.
- Define variables de entorno o propiedades Maven (`-Dclave=valor`) para entornos DEV/STG/PROD.
- Agrega `drivers/` a tu `.gitignore` si manejas binarios locales de navegadores.


## Contribución
1. Haz un fork del proyecto.
2. Crea una rama: `git checkout -b feature/nueva-funcionalidad`.
3. Commit: `git commit -m "feat: nueva funcionalidad"`.
4. Push: `git push origin feature/nueva-funcionalidad`.
5. Abre un Pull Request.
