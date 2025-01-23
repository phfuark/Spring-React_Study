import './App.css';
import Form from './components/Form';
import Table from './components/Table';
import React, {useEffect, useState} from "react";

function App() {
  // use State
  const [btnRegister, setBtnRegister] = useState(true); 
  const [products, setProducts] = useState([]);

  // use Effect
  useEffect(()=>{
    fetch("http://localhost:3001/listAll")
    .then(returno => returno.json())
    .then(convertReturn => setProducts(convertReturn));
  }, []); 

  return (
    <div>
      {/* <p>{JSON.stringify(products)}</p> */}
      <Form button={btnRegister}/>
      <Table vector={products}/>
    </div>
  );
}

export default App;
