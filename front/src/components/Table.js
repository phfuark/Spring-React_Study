function Table({vector}){
    return(
        <table className='table'>
            <thead>
                <tr>
                    <th>#</th>
                    <th>Name</th>
                    <th>Brand</th>
                    <th>Select</th>
                </tr>
            </thead>
            <tbody>
                {
                    vector.map((obj, idx) => {
                        return (
                            <tr key={idx}>
                                <td>{idx + 1}</td>
                                <td>{obj.name}</td>
                                <td>{obj.brand}</td>
                                <td><button className="btn btn-success">Select</button></td>
                            </tr>
                        );
                    })
                }   
            </tbody>
        </table>
    )
}

export default Table;
