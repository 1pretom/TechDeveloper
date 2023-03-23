import{ createBrowserRouter, RouterProvider } from 'react-router-dom'
import DashBoardPage from './pages/dashboard'
import HomePage from './pages/home'


const router = createBrowserRouter ([
  {
    path: "/",
    element: <HomePage/>
  },
  {
    path: "/dashboard/:id",
    element: <DashBoardPage/>
  },
])

function App() {
  
  return (
    <RouterProvider router={router}/>
  )
}

export default App
