import type { Demo } from "./model/demo.model";

const API_URL = "http://localhost:8080/api/demo";

export function loadAllDemoItem(): Promise<Demo[]> {

    return fetch(API_URL)
            .then((response) => response.json());
}

export function loadDemoItemById() {

}

export function searchDemoItemByContent() {

}