import { useEffect, useState } from "react";
import { loadAllDemoItem } from "./demo-api";

interface Demo {

    id: string,
    content: string,
    isActive: boolean
}

export default function DemoList() {

    const [demoList, setDemoList] = useState<Demo[]>([]);

    useEffect(() => {
        loadAllDemoItem()
            .then((data) => setDemoList(data));
    }, [])

    return (
        <>
            <h1>Version React !</h1>
            <ul>
                {
                    demoList.map((demoItem) => (
                        <li key={demoItem.id}>
                            <div>{demoItem.content}</div>
                        </li>
                    ))
                }
            </ul>
        </>
    )
}