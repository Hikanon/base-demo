import styles from './CreateUserForm.module.css'
import {useEffect, useState} from "react";
import {IUserRegistrationData} from "../../../../types/user.interface.ts";

function setTitle(title: string) {
    useEffect(() => {
        document.title = title
    })
}

const RegistrationUserForm = () => {
    const [username, setUsername] = useState<string>('')
    const [email, setEmail] = useState<string>('')
    const [password, setPassword] = useState<string>('')
    const title: string = 'Регистрация нового пользователя'

    const createUser = (e: any) => {
        e.preventDefault()
        const user: IUserRegistrationData = {username, email, password}
        console.log(user)
    }

    setTitle(title);
    return <form className={styles.form}>
        <h1>Регистрация</h1>
        <input
            placeholder='Имя пользователя'
            onChange={e => setUsername(e.target.value)}
            value={username}
        /><br/>
        <input
            placeholder='Электронная почта'
            onChange={e => setEmail(e.target.value)}
            value={email}
        /><br/>
        <input
            placeholder='Пароль'
            onChange={e => setPassword(e.target.value)}
            value={password}
        /><br/>
        <button className='btn' onClick={e => createUser(e)}>Зарегистрироваться</button>
    </form>

}

export default RegistrationUserForm
