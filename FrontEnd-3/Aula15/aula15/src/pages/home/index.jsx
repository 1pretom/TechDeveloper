import React from 'react'
import {Link, useNavigate} from "react-router-dom"

const HomePage = () => {

  const navigate = useNavigate()

  return (
    <div>HomePage
      <Link to="dashboard/200"> ir para dashboard</Link>
      <button onClick={() => navigate("/dashboard/2")}> ir para dashboard com botão</button>
    </div>
  )
}

export default HomePage