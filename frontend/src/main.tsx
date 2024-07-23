import React from 'react'
import ReactDOM from 'react-dom/client'
import './assets/styles/global.css'
import Home from "./component/screens/home/Home.tsx";

ReactDOM.createRoot(document.getElementById('root')!).render(
    <React.StrictMode>
        <Home/>
    </React.StrictMode>,
)
