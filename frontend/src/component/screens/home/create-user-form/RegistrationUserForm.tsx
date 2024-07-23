import styles from './CreateUserForm.module.css'
import {useState} from "react";
import {IUserRegistrationData} from "../../../../types/user.interface.ts";

const RegistrationUserForm = () => {
    const [username, setUsername] = useState<string>('')
    const [email, setEmail] = useState<string>('')
    const [password, setPassword] = useState<string>('')

    const createUser = (e: any) => {
        e.preventDefault()
        const user : IUserRegistrationData = {username, email, password}
        console.log(user)
    }
    return <form className={styles.form}>
        <h1>Регистрация</h1>
        <input
            placeholder='Имя пользователя'
            onChange={e => setUsername(e.target.value)}
            value={username}
        />
        <input
            placeholder='Электронная почта'
            onChange={e => setEmail(e.target.value)}
            value={email}
        />
        <input
            placeholder='Пароль'
            onChange={e => setPassword(e.target.value)}
            value={password}
        />
        <button className='btn' onClick={e => createUser(e)}>Зарегистрироваться</button>
    </form>
}

export default RegistrationUserForm
