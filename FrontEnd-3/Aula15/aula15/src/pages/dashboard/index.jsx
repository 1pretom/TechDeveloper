import React from 'react'
import { useParams } from 'react-router-dom'

const DashBoardPage = () => {
  const {id} = useParams()
  
    return (
    <div>
        <h1>

        DashBoardPage {id}
        </h1>
        </div>
  )
}

export default DashBoardPage