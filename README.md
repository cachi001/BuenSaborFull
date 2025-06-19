# 🍔 BuenSaborFull

**BuenSaborFull** es una aplicación web fullstack para la gestión integral de un restaurante. Permite la administración de productos, pedidos, clientes, usuarios, y más. Incluye funcionalidades tanto para clientes como para administradores del sistema.

---

## 🚀 Tecnologías utilizadas

### Frontend

- ⚛️ React (con Vite)
- TypeScript
- TailwindCSS *(ajustar según tu caso)*
- React Router Dom

### Backend

- ☕ Java 17
- Spring Boot
- Spring Data JPA
- Spring Security
- Hibernate
- Base de datos: MySQL
- Gradle
- Lombok

---

## 📦 Estructura del proyecto

```java
BuenSaborFull/
├── frontend/ # Interfaz de usuario (React + TypeScript)
│ └── src/
│ ├── components/
│ ├── pages/
│ ├── hooks/
│ ├── context/
│ └── assets/
├── backend/ (Spring Boot)
│ └── src/main/java/
│ ├── controller/ # Controladores REST
│ ├── service/ # Lógica de negocio
│ ├── repository/ # Acceso a datos
│ ├── mapper/ # Convierte dto
│ ├── dto/ # Convierte dto
│ ├── model/ # Entidades
│ └── config/ # Configuración
└── README.md
```

---

## ⚙️ Instrucciones de instalación y ejecución

### 1. Clonar el repositorio

```bash
git clone https://github.com/cachi001/BuenSaborFull.git
cd BuenSaborFull
```

### 2. Levantar el backend

```bash
cd backend
 ./gradlew bootRun
```

### 3. Levantar el frontend

```bash
cd frontend
npm install
npm run dev
```

## 🔍 Módulos implementados

- **Gestión de Manufacturados**: Alta, baja, modificación y listado.
- **Gestión de categorias**: Alta, baja, modificación y listado.
- **Gestión de Insumos**: Alta, baja, modificación y listado.
- **Paneles de Secciones y LandingPage**: Generación, seguimiento, historial.
- **Panel administrativo**: Vista exclusiva para gestionar insumos, categorías, pedidos y estadísticas.
- **Gestión de imágenes**: Carga de imágenes para productos.


- 🔹 **Configurar y ejecutar el Backend**

1. Abre la carpeta del **backend** en IntelliJ IDEA.
2. Asegúrate de tener **MySQL Workbench** y **MySQL Server** instalados y en ejecución.
3. Configura la conexión a la base de datos en el archivo `application.properties`:

```properties
spring.application.name=ElBuenSaborBack

spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/buensabor
spring.datasource.username=root
spring.datasource.password=1122
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql: true
```

## 👤 Integrante
- **Nombre:** Emiliano Cáceres  
- Proyecto realizado íntegramente por mí.
