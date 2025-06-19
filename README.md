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
