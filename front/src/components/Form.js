function Form({button}){
    return(
        <form>
            <input type='text' placeholder='Name' className='form-control'/>
            <input type='text' placeholder='Brand' className='form-control'/>

            {
                button
                ?
                <input type='button' value='Register' className='btn btn-primary'/>
                :
                <div>
                    <input type='button' value='Change'   className='btn btn-warning'/>
                    <input type='button' value='Remove'   className='btn btn-danger'/>
                    <input type='button' value='Cancelar' className='btn btn-secondary'/>
                </div>
            }
            
        </form>
    )
}

export default Form