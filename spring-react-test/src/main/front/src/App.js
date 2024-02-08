import './App.css';
import {useEffect, useState} from "react";

import axios from 'axios';


function App() {
    const [message, setMessage] = useState("");

    useEffect(() => {
        axios.get('http://localhost:8080/hello')
            .then(response => {
                console.log(response)
                setMessage(response.data);
            });
    }, []);

    return (
        <div>
            <h1>{message}</h1>
        </div>
    );
}
export default App;
